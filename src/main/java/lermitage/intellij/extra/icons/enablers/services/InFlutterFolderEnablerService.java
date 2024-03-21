// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons.enablers.services;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.project.Project;
import lermitage.intellij.extra.icons.enablers.IconEnabler;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

@Service(Service.Level.PROJECT)
public final class InFlutterFolderEnablerService implements IconEnabler {

    private boolean isFlutterProject = false;

    private static final Logger LOGGER = Logger.getInstance(InFlutterFolderEnablerService.class);

    public static InFlutterFolderEnablerService getInstance(@NotNull Project project) {
        return project.getService(InFlutterFolderEnablerService.class);
    }

    @Override
    public void init(@NotNull Project project) {
        File pubspec = new File(project.getBasePath(), "pubspec.yaml");
        if (pubspec.exists()) {
            try {
                String pubspecContent = Files.readString(pubspec.toPath());
                isFlutterProject = pubspecContent.contains("sdk: flutter") || pubspecContent.contains("sdk:flutter");  //NON-NLS
            } catch (IOException e) {
                LOGGER.warn("Canceled init of Flutter icons Enabler", e); //NON-NLS
            }
        }
    }

    @Override
    public boolean verify(@NotNull Project project, @NotNull String absolutePathToVerify) {
        return isFlutterProject;
    }

    @Override
    public boolean terminatesConditionEvaluation() {
        return false;
    }
}

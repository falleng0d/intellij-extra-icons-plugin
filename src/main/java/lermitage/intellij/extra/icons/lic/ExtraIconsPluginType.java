// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons.lic;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@SuppressWarnings("HardCodedStringLiteral")
public enum ExtraIconsPluginType {

    SUBSCRIPTION("lermitage.intellij.extra.icons", "PEXTRAICONS", true),
    LIFETIME("lermitage.extra.icons.lifetime", "PEXTRAICONSLIFE", true),
    FREE("lermitage.extra.icons.free", "PEXTRAICONFREE", false),
    NOT_FOUND("lermitage.extra.icons.not.found", "PNOTFOUND", true);

    private final String pluginId;
    private final String productCode;
    private final boolean requiresLicense;

    ExtraIconsPluginType(String pluginId, String productCode, boolean requiresLicense) {
        this.pluginId = pluginId;
        this.productCode = productCode;
        this.requiresLicense = requiresLicense;
    }

    public @NotNull String getPluginId() {
        return pluginId;
    }

    public @NotNull String getProductCode() {
        return productCode;
    }

    public boolean isRequiresLicense() {
        return requiresLicense;
    }

    @Override
    public String toString() {
        return "ExtraIconsPluginType{" +
            "pluginId='" + pluginId + '\'' +
            ", productCode='" + productCode + '\'' +
            ", requiresLicense=" + requiresLicense +
            '}';
    }

    /**
     * Plugin types with code that actually exists. Filter others, otherwise users would be able
     * to bypass license by installing a plugin with the appropriate code.
     */
    public static Set<ExtraIconsPluginType> getFindableTypes() {
        return Arrays.stream(ExtraIconsPluginType.values())
            .dropWhile(type -> type == NOT_FOUND)
            .collect(Collectors.toUnmodifiableSet());
    }
}

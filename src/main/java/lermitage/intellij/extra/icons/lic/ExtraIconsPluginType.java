// SPDX-License-Identifier: MIT

package lermitage.intellij.extra.icons.lic;

import org.jetbrains.annotations.NotNull;

import java.util.List;

@SuppressWarnings("HardCodedStringLiteral")
public enum ExtraIconsPluginType {

    SUBSCRIPTION("lermitage.intellij.extra.icons", "PEXTRAICONS", false),
    LIFETIME("lermitage.extra.icons.lifetime", "PEXTRAICONSLIFE", false),
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

    public static @NotNull List<ExtraIconsPluginType> getFindableTypes() {
        return List.of(SUBSCRIPTION, LIFETIME, FREE);
    }

    @Override
    public String toString() {
        return "ExtraIconsPluginType{" +
            "pluginId='" + pluginId + '\'' +
            ", productCode='" + productCode + '\'' +
            ", requiresLicense=" + requiresLicense +
            '}';
    }

}

package tw.nekomimi.nekogram.icons;


import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import tw.nekomimi.nekogram.NekoConfig;

public class fluffyResources extends Resources {

    private final Resources mResources;
    private BaseIconSet current = NekoConfig.getIconPack();

    public void getActiveIconPack() {
        current = NekoConfig.getIconPack();
    }

    public fluffyResources(@NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        mResources = resources;
    }

    @Nullable
    @Override
    public Drawable getDrawableForDensity(int id, int density, @Nullable Theme theme) {
        return mResources.getDrawableForDensity(current.getIcon(id), density, theme);
    }

}

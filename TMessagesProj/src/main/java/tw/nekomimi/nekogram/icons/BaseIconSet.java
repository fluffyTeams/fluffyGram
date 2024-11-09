package tw.nekomimi.nekogram.icons;

import android.util.SparseIntArray;

public abstract class BaseIconSet {
    public SparseIntArray iconPack = new SparseIntArray();

    public Integer getIcon(Integer id) {
        return iconPack.get(id, id);
    }
}

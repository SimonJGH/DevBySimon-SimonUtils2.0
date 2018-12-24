package android.support.v7.widget.helper;

public class CompatItemTouchHelper extends ItemTouchHelper {

    public CompatItemTouchHelper(Callback callback) {
        super(callback);
    }

    /**
     * Developer callback which controls the behavior of ItemTouchHelper.
     *
     * @return {@link Callback}
     */
    public Callback getCallback() {
        return mCallback;
    }
}

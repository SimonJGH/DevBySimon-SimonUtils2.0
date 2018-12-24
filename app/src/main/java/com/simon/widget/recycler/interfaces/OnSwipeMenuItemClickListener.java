package com.simon.widget.recycler.interfaces;


import com.simon.widget.recycler.SDRecyclerView;

/**
 * OnSwipeMenuItemClickListener
 */
public interface OnSwipeMenuItemClickListener {

    /**
     * Invoke when the menu item is clicked.
     *
     * @param closeable       closeable.
     * @param adapterPosition adapterPosition.
     * @param menuPosition    menuPosition.
     * @param direction       can be {@link SDRecyclerView#LEFT_DIRECTION}, {@link SDRecyclerView#RIGHT_DIRECTION}.
     */
    void onItemClick(Closeable closeable, int adapterPosition, int menuPosition, @SDRecyclerView.DirectionMode int direction);

}
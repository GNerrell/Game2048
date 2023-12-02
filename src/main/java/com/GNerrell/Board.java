package com.GNerrell;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Board {
    private int width;
    private int height;
    private Map<Key, Integer> board = new HashMap<>();

    public Board() {
        this.width = 3;
        this.height = 4;
    }
    public abstract void fillBoard();
    public abstract List<Key> availableSpace();
    public abstract void addItem(Key key, Integer value);
    public abstract Key getKey(int i, int j);
    public abstract Integer getValue(Key key);
    public abstract List<Key> getColumn(int j);
    public abstract List<Key> getRow(int i);
    public abstract boolean hasValue(Integer value);
    public abstract List<Integer> getValues(List<Key> keys);

}
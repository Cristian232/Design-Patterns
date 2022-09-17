package com.company.Behavioral.Iterator.FirstImplementation;

// Enum that represents the aggregate
public enum ThemeColor {

    RED,
    ORANGE,
    BLACK,
    WHITE;

    public static Iterator<ThemeColor> getIterator(){
        return new ThemeColorIterator();
    }

    private static class ThemeColorIterator implements Iterator {

        private int position;

        @Override
        public boolean hasNext() {
            return position < ThemeColor.values().length;
        }

        @Override
        public Object next() {
            return ThemeColor.values()[position++];
        }
    }

}

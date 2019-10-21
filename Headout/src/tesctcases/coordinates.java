package tesctcases;

public class coordinates {
    
        int x;
        int y;

        public boolean equals(Object o) {
        	coordinates c = (coordinates) o;
            return c.x == x && c.y == y;
        }

        public coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

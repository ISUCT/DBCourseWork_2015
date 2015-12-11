

import java.util.Set;
import java.util.HashSet;



    public class Book {

        private int ID;
        private String NAME;
        private String AUTHOR;

        public Book() {}
        public Book(int id, String name, String author) {
            this.AUTHOR = author;
            this.NAME = name;
            this.ID = id;
        }

        public int getId() {
            return ID;
        }

        public void setId( int id ) {
            this.ID = id;
        }
        public String getName() {
            return NAME;
        }
        public void setName( String name ) {
            this.NAME = name;
        }
        public String getAuthor() {
            return AUTHOR;
        }
        public void setAuthor( String author ) {
            this.AUTHOR = author;
        }

    }



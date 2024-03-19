package com.example.a3lab;

public class PlantClass {
        private int imageId;
        private String title;

        public PlantClass(int imageId, String title) {
                this.imageId = imageId;
                this.title = title;
        }

        public int getImageId() {
                return imageId;
        }

        public void setImageId(int imageId) {
                this.imageId = imageId;
        }

        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }
}

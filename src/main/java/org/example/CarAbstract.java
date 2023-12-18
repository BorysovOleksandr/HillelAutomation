package org.example;

public abstract class CarAbstract { //создаем абстрактный класс

        private String model;       //задаем поля класса
        private String color;       //задаем поля класса
        private int maxSpeed;       //задаем поля класса

        public abstract void gas();     //абстрактный метод в классе

        public abstract void brake();   //абстрактный метод в классе

        public String getModel() {      //метод "получить модель"
            return model;
        }

        public void setModel(String model) {        //метод "установить модель"
            this.model = model;                     //так задаем модель в ЭТОМ классе
        }

        public String getColor() {                  //
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

}

package ru.netology.javaqa.javamvn.services;

public class Radio {
    private int currentRadioStation; // текущая радиостанция
    private int currentVolume; // текущая громкость
    private int maxStation; // кол-во радиостанций

    public Radio() {
        this.maxStation = 9; // В конструкторе значение переменной
        // устанавливается равным 9 (максимальное кол-во станций)

    }

    public Radio(int stationsCount) { // конструктор с переменной = кол-во станций минус 1
        this.maxStation = stationsCount - 1;

    }

    public int getCurrentVolume() { //дай текущую громкость
        return currentVolume; // верни текущую громкость
    }

    // метод по установке текущей громкости в пределах от 0 до 100 (если выше/ниже, то отсанови метод,
    // иначе устанавливай ту, которую просят - ньюКаррентВольюм)
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentRadioStation() { // дай текущую радиостанцию
        return currentRadioStation; // верни текущую радиостанцию
    }

    // Номер текущей радиостанции может принимать значения только в пределах от 0 до 9.
    // Клиент должен иметь возможность выставлять номер радиостанции через прямое указание её номера.
    // Для этого подойдёт один обычный метод-сеттер с проверкой на допустимость номера станции.
    public void setCurrentRadioStation(int currentRadioStation) { // метод по установки текущей станции
        if (currentRadioStation > maxStation) { // если текущая станция > 9, то останови метод.
            return;
        }
        if (currentRadioStation < 0) { // если текущая станция < 0, то останови метод.
            return;
        }
        this.currentRadioStation = currentRadioStation; // в противном случае установи ту станцию, какую просят.
    }

    public void volumeUp() { // метод по увеличению громкости
        if (currentVolume < 100) { // если текущая громкость < 100
            currentVolume = currentVolume + 1; // то, при увеличении громкости, интервал +1
        }
    }

    public void volumeDown() { // метод по уменьшению громкости
        if (currentVolume > 0) { // если текущая громкость > 0
            currentVolume = currentVolume - 1; // то при уменьшении громкости, интервал -1
        }
    }

    // Если текущая радиостанция 9 и клиент нажал на кнопку next (=вызвал одноимённый метод next, с англ. — следующая)
    // на пульте, то текущей должна стать нулевая.
    // В остальных случаях при нажатии на эту же кнопку радио переключается просто на следующую станцию.
    public void next() { // метод по установке станции при нажатии "следующая"
        if (currentRadioStation < maxStation) { // если текущая станция меньше 9
            currentRadioStation = currentRadioStation + 1; // то при нажатии "следующая"- № станции увеличивается с интервалом 1
        } else {
            currentRadioStation = 0; // в противном случае - был на 9, нажал "следующая", текущая станция становится 0
        }
    }

    public void prev() { // метод по установке станции при нажатии "предыдущая"
        if (currentRadioStation > 0) { // если текущая станция > 0
            currentRadioStation = currentRadioStation - 1; // то при нажатии "предыдущая"-№ станции уменьшается с интервалом 1
        } else {
            currentRadioStation = maxStation; // в противном случае - был на № 0, нажал "предыдущая", переходит на № 9
        }
    }
}
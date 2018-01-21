package com.company.lesson10.homework.clothes;

public class Studio {
    public static void main(String[] args) {
        TShirt tShirt1 = new TShirt(Sizes.L, 100, "Красный");
        TShirt tShirt2 = new TShirt(Sizes.S, 180, "Белый");
        Pants pants1 = new Pants(Sizes.XS, 320, "Коричневый");
        Pants pants2 = new Pants(Sizes.XXS, 265, "Серый");
        Skirt skirt1 = new Skirt(Sizes.M, 345, "Фиолетовый");
        Skirt skirt2 = new Skirt(Sizes.S, 315, "Оранжевый");
        Tie tie1 = new Tie(Sizes.XXS, 250, "Серо-синий");
        Tie tie2 = new Tie(Sizes.XS, 290, "Зеленый");
        Clothes[] clothesArray = {tShirt1, tShirt2, pants1, pants2, skirt1, skirt2, tie1, tie2};
        putClothesOnWomen(clothesArray);
        putClothesOnMen(clothesArray);
    }

    public static void putClothesOnWomen(Clothes[] array) {
        for (Clothes clothesIter : array) {
            if (clothesIter instanceof WomenClothes) {
                ((WomenClothes) clothesIter).putClothesOnWomen();
            }
        }
    }

    public static void putClothesOnMen(Clothes[] array) {
        for (Clothes clothesIter : array) {
            if (clothesIter instanceof MenClothes) {
                ((MenClothes) clothesIter).putClothesOnMen();
            }
        }
    }
}

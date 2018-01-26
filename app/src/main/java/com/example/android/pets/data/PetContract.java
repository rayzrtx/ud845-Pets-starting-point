package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by raylinares on 1/26/18.
 */

public final class PetContract {

    private PetContract(){}

    public static abstract class PetEntry implements BaseColumns{

        public static final String TABLE_NAME = "pets";

        //This is just naming each column in the pets table
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        //Constants for each gender option
        public final static int GENDER_UNKNOWN = 0;
        public final static int GENDER_MALE = 1;
        public final static int GENDER_FEMALE= 2;
    }
}

package com.vitaliy1991.app.utils.runners;

import com.vitaliy1991.app.utils.convertors.PrimitiveConvertor;

/**
 * Created by vitor on 02-Feb-17.
 */
public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor convertor1 = new PrimitiveConvertor();
        convertor1.floatToChar(120.0f);
        convertor1.intToChar(100);
        convertor1.charToInt('v');
    }

}

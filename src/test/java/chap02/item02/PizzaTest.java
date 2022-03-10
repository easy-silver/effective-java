package chap02.item02;

import org.junit.jupiter.api.Test;

import static chap02.item02.NyPizza.Size.*;
import static chap02.item02.Pizza.Topping.*;

class PizzaTest {

    /**
     * 빌더 패턴 테스트
     */
    @Test
    void builder_test() {
        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone calzone = new Calzone.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();
    }

}
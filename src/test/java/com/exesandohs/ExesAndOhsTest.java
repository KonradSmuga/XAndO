package com.exesandohs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExesAndOhsTest {

    private ExesAndOhs exesAndOhs = new ExesAndOhs();

    @Test
    public void shouldReturnTrueWhenThisSameAmountXAndO() {
        //given
        String word = "xxxooo";
    //when
      boolean result =  exesAndOhs.checkXO(word);
    //then
    assertThat(result).isTrue();
}

    @Test
    public void shouldReturnTrueWithThisSameAmountOfXAndOWithUpperCase() {

        //given
        String word = "xxxXooOo";
        //when
        boolean result =  exesAndOhs.checkXO(word);

        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnFalseWhenNotThisSameAmountOfXAndO() {
        //given
        String word = "xxx23424esdsfvxXXOOooo";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then

        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnFalseIfNotThisSameAmountOfXAndO() {
        //given
        String word = "xXxxoewrcoOoo";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then

        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnFalseIfNotThisSameAmountOfXAndOWithHighLetter() {
        //given
        String word = "XxxxooO";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then


        assertThat(result).isFalse();
    }

    @Test
    public void shouldReturnTrueIfNoXAndNoO() {
        //given
        String word = "zssddd";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

    @Test
    public void shouldReturnFalseIfThereIsXButNoO() {
        //given
        String word = "Xxxxertr34";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then
        assertThat(result).isFalse();
    }


    @Test
    public void shouldReturnTrueIfSameAmountOfSmallXAndBigO() {
        //given
        String word = "xxxxOOOO";
        //when
        boolean result = exesAndOhs.checkXO(word);
        //then
        assertThat(result).isTrue();
    }

}

package io.generics.myArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MySetTest {

    @Test
    public void constructorTest(){
        String[] in = {"a","b","c","d","d"};
        MyArrayList<String> input = new MyArrayList<>(in);
        MySet<String> mySet = new MySet<>(input);
        String[] expected = {"a","b","c","d"};
        String[] actual = mySet.getMySet().toMyArray();

        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void constructor2Test(){
        MySet<Integer> mySet = new MySet<>();
        int expected = 16;
        int actual = mySet.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructor3Test(){
        MySet<Integer> mySet = new MySet<>(3);
        int expected = 3;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest(){
        Integer[] in = {1,2,3,4,6};
        MyArrayList<Integer> input = new MyArrayList<>(in);
        MySet<Integer> mySet = new MySet<>(input);
        Integer toBeAdded = 6;
        MyArrayList<Integer> expected = input;
        mySet.add(toBeAdded);
        MyArrayList<Integer> actual = mySet.getMySet();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAllTest1(){
        Integer[] input = {1,2,3,4,5};
        MySet<Integer> mySet = new MySet<>(new MyArrayList<>(input));
        Integer[] toBeAdded = {6,7,8};
        Integer[] expected = {1,2,3,4,5,6,7,8};
        mySet.addAll(toBeAdded);
        Integer[] actual = mySet.toArray();
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        String[] input = {"a","b","c","d","e"};
        MySet<String> mySet = new MySet<>(new MyArrayList<>(input));
        mySet.remove("c");
        String[] expected = {"a","b","d","e"};
        String[] actual = mySet.toArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void retainAll(){
        Integer[] input = {1,2,3,4,5,6,7};
        MySet<Integer> mySet = new MySet<>(new MyArrayList<>(input));
        Integer[] expected = {4,5,6,7};
        mySet.retainAll(new Integer[]{4,5,6,7});
        Integer[] actual = mySet.toArray();
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void sizeTest(){
        MySet<Integer> mySet = new MySet<>(new MyArrayList<>(new Integer[]{1,2,3,4,5}));
        int expected = 5;
        int actual = mySet.size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);
        boolean actual = mySet.contains(3);
        Assert.assertTrue(actual);
    }

    @Test
    public void containsAll(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);

        Assert.assertTrue(mySet.containsAll(new Integer[]{2,5}));
    }

    @Test
    public void containsAll2(){
        Integer[] input = {1,2,3,4,5};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);

        Assert.assertFalse(mySet.containsAll(new Integer[]{5,7}));
    }

    @Test
    public void isEmptyTest(){
        Integer[] input = {};
        MyArrayList<Integer> in = new MyArrayList<>(input);
        MySet<Integer> mySet = new MySet<>(in);

        Assert.assertTrue(mySet.isEmpty());
    }

    @Test
    public void clearTest(){
        MySet<Integer> mySet = new MySet<>(new MyArrayList<>(new Integer[]{1,2,3,4,5}));
        Integer[] expected = {};
        mySet.clear();
        Integer[] actual = mySet.toArray();

        Assert.assertArrayEquals(expected, actual);
    }


}

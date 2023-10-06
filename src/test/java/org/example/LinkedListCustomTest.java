package org.example;

import org.junit.*;




public class LinkedListCustomTest {

    private static LinkedListCustom linkedList = new LinkedListCustom();
    private static Integer count = 0;




    @Before
    public void SetUp() throws Exception{
        System.out.println("J Unit Test Beginning , Test # : " + count);
        linkedList.clear();

    }




    @Test
    public void AddFront(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
    }



    @Test
    public void GetFirst(){
        linkedList.addFront(1);
        Assert.assertEquals(1, linkedList.getFirst());
    }



    @Test
    public void GetLast(){
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        Assert.assertEquals(1, linkedList.getLast());
    }



    @Test
    public void AddBack(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());

    }

    @Test
    public void Clear(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.clear();

        Assert.assertEquals(0, linkedList.size());
    }




    @Test
    public void DeleteValue(){
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        linkedList.deleteValue(2);

        Assert.assertEquals(2, linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }





    @After
    public void afterEachTest(){
        System.out.println("J Unit Test Complete ##### Test : " + count++);
    }




    @AfterClass
    public static void allTestCompleted(){
        System.out.println("All J Unit Test Completed.");
    }



}
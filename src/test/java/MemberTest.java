/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Senzo Stofile - 219345406
 */
public class MemberTest {
    
    private Member member1;
    private Member member2;
    private Member member3;
    
    public MemberTest() {
    }
    
    @Before
    public void setUp() {
        member1 = new Member();
        member2 = new Member();
        member3 = member1;
    }
    
    @After
    public void tearDown() {
    }
    
    //This method is for testing Identity
    @Test
    public void testIdentity() {
        assertSame(member1, member3);
    }
    
    //This method is for testing Equality
    @Test
    public void testEquality() {
        assertEquals(member1, member3);
    }
    
    //This is a failing test
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        String member = "";
        member1.setMember(member);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    //This is a timeout test
    @Test(timeout = 105)
    public void testWithTimeout() {
        final int factorialOf = 1+ (int)(25000*Math.random());
        member1.setMember(""+factorialOf);
    }
    
    //This is a disabling test
    @Test
    @Ignore
    public void testGetMember() {
        System.out.println("getMember");
        String expResult = "";
        String result = member1.getMember();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.  
    }
    
}

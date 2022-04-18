package com.uh.pat;
import com.uh.pat.AVLTree;   
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {
    @Test(timeout = 4000)
    public void test1() throws Throwable {
       
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }

	@Test(timeout = 4000)
    public void test2()  throws Throwable  {
		  AVLTree aVLTree0 = new AVLTree();
		  int int0 = 0;
		  aVLTree0.delete(0);
		  int int1 = 0;
		  aVLTree0.insert(0);
		  AVLTree.Node aVLTree_Node0 = aVLTree0.getRoot();
		  AVLTree.Node aVLTree_Node1 = aVLTree0.getRoot();
		  aVLTree_Node1.right = aVLTree_Node0;
		  aVLTree0.getBalance(aVLTree_Node1);
		  // Undeclared exception!
		  aVLTree0.find(1);
	}

        
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
       
       aVLTree0.insert(202);
       aVLTree0.insert(1409);
       aVLTree0.insert(5678);
       aVLTree0.insert(8009);
       aVLTree0.delete(1409);
       aVLTree0.delete(5678);
       aVLTree0.delete(8009);   
       
        // Undeclared exception!
        
        
    }

    
  
}

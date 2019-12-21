package practice.examples;

import org.junit.Test;

public class BTFromPreAndInOrderTraversalTest {

    @Test
    public void vanillaTest() {
        BTFromPreAndInOrderTraversal.buildTree(new int[]{1,2,4,6,7,3,5}, new int[]{2,6,4,7,1,3,5});
    }
}
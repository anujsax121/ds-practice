package com.practice.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class DetectLoop {

    public static boolean isLoop(LinkedList.Node node) {

        Map<LinkedList.Node, Boolean> map = new HashMap<LinkedList.Node, Boolean>();
        while (node != null) {

            if (!map.containsKey(map.get(node))) {
                map.put(node, false);
            } else {
                return true;
            }
            node = node.next;

        }

        return false;
    }
}

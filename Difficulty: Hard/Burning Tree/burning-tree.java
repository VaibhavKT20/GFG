/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}  
*/

class Solution {
    
    public static Node buildParentMap(Node root, int target, Map<Node, Node> parentMap) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        Node targetNode = null;
        
        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.data == target) targetNode = curr;
            
            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                q.add(curr.left);
            }
            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                q.add(curr.right);
            }
        }
        return targetNode;
    }
    
    public static int minTime(Node root, int target) {
        // Step 1: Build parent map & find target node
        Map<Node, Node> parentMap = new HashMap<>();
        Node targetNode = buildParentMap(root, target, parentMap);
        
        // Step 2: BFS fire spreading
        Queue<Node> q = new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        
        q.add(targetNode);
        visited.add(targetNode);
        
        int time = -1;
        
        while (!q.isEmpty()) {
            int size = q.size();
            time++; // each BFS level = 1 second
            
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                
                // left child
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    q.add(curr.left);
                }
                // right child
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    q.add(curr.right);
                }
                // parent
                if (parentMap.containsKey(curr) && !visited.contains(parentMap.get(curr))) {
                    visited.add(parentMap.get(curr));
                    q.add(parentMap.get(curr));
                }
            }
        }
        return time;
    }
}

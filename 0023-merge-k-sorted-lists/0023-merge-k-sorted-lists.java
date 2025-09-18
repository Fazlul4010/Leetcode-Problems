
class Solution {
    public ListNode mergeKLists(ListNode[] Lists){
        List<Integer> vals= new ArrayList<>();

        // collect all values

        for (ListNode node : Lists){
            while(node !=null){
                vals.add(node.val);
                node=node.next;
            }
        }
        if (vals.isEmpty()) return null;
        Collections.sort(vals);

        // build values List
        ListNode dummy= new ListNode(0);
        ListNode curr=dummy;
        for(int v: vals){
            curr.next= new ListNode(v);
            curr=curr.next;
        }
        return dummy.next;
    }
}
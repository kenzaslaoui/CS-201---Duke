public class RemoveMin {
    public ListNode remove (ListNode list) {
        if(list == null || list.next == null){
            return null;
        }
        ListNode ref = new ListNode(0);
        ref = list;
        ListNode current = new ListNode(0);
        current = list.next;
        ListNode nodeBeforeList = new ListNode(0);
        ListNode nodeBeforeCurrent = new ListNode(0);

        while(current.next != null){
            if(list.info < current.info){
                nodeBeforeCurrent = current;
                current = current.next;
            }
            else{
                nodeBeforeList = nodeBeforeCurrent;
                list = current;
                nodeBeforeCurrent = list;
                current = list.next;
            }
        }

        if(current.next == null){
            if(list.info < current.info){
                if(ref == list){
                    ref = list.next;
                    list.next = null;
                }
                nodeBeforeList.next = list.next;
                list.next = null;
            }
            else{
                if(ref == list){
                    list.next = null;
                }
                nodeBeforeCurrent.next = null;
            }
        }

        return ref;
    }
}
public class ListsEqual {
    public int equal (ListNode a1, ListNode a2) {
        boolean areEqual = true;
        if((a1 == null & a2 != null) || (a1 != null & a2 == null)){
            areEqual = false;
        }
        else if(a1 == null & a2 == null){
            areEqual = true;
        }
        else if (a1 != null & a2 != null){  
            while(a1.next != null & a2.next != null){
                if(a1.info != a2.info){
                    areEqual = false;
                    break;
                }
                a1 = a1.next; 
                a2 = a2.next;
            }
            if((a1.next == null & a2.next != null) || (a1.next != null & a2.next == null)){
                areEqual = false;
            }
            if(a1.next == null & a2.next == null){
                if(a1.info != a2.info){
                    areEqual = false;
                }
            }
        }
        
        if(areEqual){
            return 1;
        }
        else{
            return 0;
        }
    }
}
public class ListSum {
    public int sum(ListNode list, int thresh) {
        
        int sum = 0;

        if(list != null){
            while(list.next != null){
                if(list.info > thresh){
                    sum += list.info;
                }
                list = list.next;
            }
            if(list.next == null){
                if(list.info > thresh){
                    sum += list.info;
                }
            }
        }

    return sum;
    }
}
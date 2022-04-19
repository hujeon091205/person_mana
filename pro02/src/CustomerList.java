public class CustomerList {
    private Customer[] customers;  //cannot understand
    private int total_client=0;

    public CustomerList(int total_client){
        customers=new Customer[total_client];
    }
    public  boolean addCustomer(Customer customer){
        if(total_client> customers.length){
            return false;
        }else {
            total_client+=1;
            customers[total_client++]=customer;
            return true;
        }
    }
    public boolean replaceCustomer(int index,Customer customer){
        if(index>total_client){
            return false;
        }else{
            customers[index]=customer;
            return true;
        }
    }
    public boolean deleteCustomer(int index){
        if (index<0||index>total_client){
            return false;
        }else{
            customers[index]=null;
            for(int i=index;i<= customers.length-index;i++){
                customers[index]=customers[index-1];
            }
            total_client--;
            return true;
        }
    }
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total_client];
        for (int i = 0; i < total_client; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
    public Customer getCustomer(int index){
        if(index>customers.length){
            return null;
        }else{
            return customers[index];
        }
    }
    public int getTotal() {
        return total_client;
    }



}

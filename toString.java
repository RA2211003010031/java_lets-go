class Laptop{
    String name;
    int year;

    public String toString() {
        return name + ":" + year;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + year;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (year != other.year)
            return false;
        return true;
    }
}


public class toString {
    public static void main(String args[]) {
        
        Laptop obj = new Laptop();
        obj.name = "Mac";
        obj.year = 2025;

        System.out.println(obj);

        //by default toString is called 
        System.out.println(obj.toString());
        
        Laptop obj1 = new Laptop();
        obj1.name = "Mac";
        obj1.year = 2025;

        boolean ifEquals = obj.equals(obj1);
        System.out.println(ifEquals);
    }
}

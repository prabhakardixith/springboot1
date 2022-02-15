package functionalInterface;

import java.util.function.Supplier;

public class _Supplier
{
    public static void main(String[] args) {

        System.out.println(getDbUrl());
        System.out.println("supplier Functional Interface");
        System.out.println(getDbUrlUsingSupplier.get());

        System.out.println("Supplier Interface Using NonStatic");
        _Supplier s = new _Supplier();
        System.out.println(s.getDbUrlUsingSupplierNonStatic.get());
    }
    static public String getDbUrl()
    {
        return "jdbc:mysql://localhost:3306:Core";
    }

    static Supplier<String> getDbUrlUsingSupplier = () -> "jdbc:mysql://localhost:3306:Core";
    Supplier<String> getDbUrlUsingSupplierNonStatic = () -> "jdbc:mysql://localhost:3306:Core";
}

import java.util.LinkedList;
import java.util.ListIterator;

class PolynomialTerm {
    int coeff; // Coefficient
    int exp;   // Exponent

    PolynomialTerm(int coeff, int exp) {
        this.coeff = coeff;
        this.exp = exp;
    }
}
public class C_76 {
    public static LinkedList<PolynomialTerm> addPolynomials(LinkedList<PolynomialTerm> poly1, LinkedList<PolynomialTerm> poly2) {
        LinkedList<PolynomialTerm> result = new LinkedList<>();

        ListIterator<PolynomialTerm> iter1 = poly1.listIterator();
        ListIterator<PolynomialTerm> iter2 = poly2.listIterator();

        while (iter1.hasNext() && iter2.hasNext()) {
            PolynomialTerm term1 = iter1.next();
            PolynomialTerm term2 = iter2.next();

            if (term1.exp == term2.exp) {
                int newCoeff = term1.coeff + term2.coeff;
                if (newCoeff != 0) {
                    result.add(new PolynomialTerm(newCoeff, term1.exp));
                }
            } else if (term1.exp > term2.exp) {
                result.add(term1);
                iter2.previous();
            } else {
                result.add(term2);
                iter1.previous();
            }
        }

        while (iter1.hasNext()) {
            result.add(iter1.next());
        }

        while (iter2.hasNext()) {
            result.add(iter2.next());
        }

        return result;
    }

    // Method to convert polynomial list to string representation
    public static String polynomialToString(LinkedList<PolynomialTerm> poly) {
        StringBuilder sb = new StringBuilder();
        for (PolynomialTerm term : poly) {
            if (term.coeff != 0) {
                if (sb.length() != 0) {
                    sb.append(" + ");
                }
                sb.append('(');
                if(term.coeff!=1){
                    if (term.exp == 0) {
                        sb.append(term.coeff);
                    } else if (term.exp == 1) {
                        sb.append(term.coeff).append("x");
                    } else {
                        sb.append(term.coeff).append("x^").append(term.exp);
                    }
                }else{
                    if (term.exp == 0) {
                        sb.append(term.coeff);
                    } else if (term.exp == 1) {
                        sb.append("x");
                    } else {
                        sb.append("x^").append(term.exp);
                    }
                }
                
                sb.append(')');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage
        LinkedList<PolynomialTerm> poly1 = new LinkedList<>();
        poly1.add(new PolynomialTerm(3, 2)); // 3x^2
        poly1.add(new PolynomialTerm(4, 1)); // 4x
        poly1.add(new PolynomialTerm(2, 0)); // 2

        LinkedList<PolynomialTerm> poly2 = new LinkedList<>();
        poly2.add(new PolynomialTerm(1, 3)); // x^3
        poly2.add(new PolynomialTerm(-3, 2)); // -3x^2
        poly2.add(new PolynomialTerm(5, 0)); // 5

        LinkedList<PolynomialTerm> result = addPolynomials(poly1, poly2);

        System.out.println("Polynomial 1: " + polynomialToString(poly1));
        System.out.println("Polynomial 2: " + polynomialToString(poly2));
        System.out.println("Sum: " + polynomialToString(result));
    }
}

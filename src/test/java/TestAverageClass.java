import org.example.AverageResolverClass;
import org.example.CompareAverageClass;
import org.example.ListClass;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class TestAverageClass {

    @Test
    public void correctAverage(){

        ListClass listClass1 = new ListClass();
        ListClass listClass2 = new ListClass();
        AverageResolverClass averageResolverClass1 = new AverageResolverClass(listClass1);
        AverageResolverClass averageResolverClass2 = new AverageResolverClass(listClass2);
        ArrayList<Integer> arrayList1 = listClass1.getIntegerList();
        ArrayList<Integer> arrayList2 = listClass2.getIntegerList();

        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(9);

        arrayList2.add(2);
        arrayList2.add(12);
        arrayList2.add(8);

        assertThat(averageResolverClass1.returnListAverage()).isEqualTo(4.67);
        assertThat(averageResolverClass2.returnListAverage()).isEqualTo(7.33);
    }
    @Test
    public void correctComparing(){
        ListClass listClass1 = new ListClass();
        ListClass listClass2 = new ListClass();
        AverageResolverClass averageResolverClass1 = new AverageResolverClass(listClass1);
        AverageResolverClass averageResolverClass2 = new AverageResolverClass(listClass2);
        ArrayList<Integer> arrayList1 = listClass1.getIntegerList();
        ArrayList<Integer> arrayList2 = listClass2.getIntegerList();

        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(9);

        arrayList2.add(2);
        arrayList2.add(12);
        arrayList2.add(8);

        assertTrue(averageResolverClass1.returnListAverage() < averageResolverClass2.returnListAverage());
    }

    @Test
    public void testListValues(){
        ListClass mockListClass = mock(ListClass.class);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(9);

        when(mockListClass.getIntegerList()).thenReturn(arrayList);

        AverageResolverClass averageResolverClass = new AverageResolverClass(mockListClass);
        double res = averageResolverClass.returnListAverage();

        assertEquals(4.67, res);
    }
    @Test
    public void testStringExpressions(){
        ListClass listClass1 = new ListClass();
        ListClass listClass2 = new ListClass();
        ListClass listClass3 = new ListClass();
        AverageResolverClass averageResolverClass1 = new AverageResolverClass(listClass1);
        AverageResolverClass averageResolverClass2 = new AverageResolverClass(listClass2);
        AverageResolverClass averageResolverClass3 = new AverageResolverClass(listClass3);
        ArrayList<Integer> arrayList1 = listClass1.getIntegerList();
        ArrayList<Integer> arrayList2 = listClass2.getIntegerList();
        ArrayList<Integer> arrayList3 = listClass3.getIntegerList();
        CompareAverageClass cac = new CompareAverageClass();

        arrayList1.add(1);
        arrayList1.add(4);
        arrayList1.add(9);

        arrayList2.add(2);
        arrayList2.add(12);
        arrayList2.add(8);

        arrayList3.add(2);
        arrayList3.add(12);
        arrayList3.add(8);

        assertThat(cac.returnLargest(averageResolverClass1.returnListAverage(), averageResolverClass2.returnListAverage())).isEqualTo("Второй список имеет большее среднее значение");
        assertThat(cac.returnLargest(averageResolverClass2.returnListAverage(), averageResolverClass1.returnListAverage())).isEqualTo("Первый список имеет большее среднее значение");
        assertThat(cac.returnLargest(averageResolverClass2.returnListAverage(), averageResolverClass3.returnListAverage())).isEqualTo("Средние значения равны");
    }

    @Test
    public void testAddNumberToList(){
        ListClass listClass1 = new ListClass();
        ArrayList<Integer> arrayList1 = listClass1.getIntegerList();

        listClass1.addNumber(5);

        assertThat(listClass1.getIntegerList().get(0)).isEqualTo(5);
    }
    @Test
    public void testToStringMethod(){
        ListClass listClass1 = new ListClass();
        ArrayList<Integer> arrayList1 = listClass1.getIntegerList();


        assertThat(listClass1.toString()).isEqualTo("ListClass{" +
                "integerList=" + arrayList1 +
                '}');
    }
}

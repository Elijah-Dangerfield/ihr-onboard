package unit;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class TodoBusinessTest extends TestCase {
    private TodoService todoService;
    private TodoBusiness todoBusiness;

    @Test
    public void testRetrieve_SpringToDos_size2() {
        todoService = new TodoServiceStub();
        todoBusiness = new TodoBusiness(todoService);

        List<String> result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(result.size(), 2);
    }
}
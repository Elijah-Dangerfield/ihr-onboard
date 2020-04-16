package unit.mock;

import org.junit.Test;
import org.mockito.Mockito;
import unit.TodoBusiness;
import unit.TodoService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class TodoBusinessMockTest {
    private TodoService todoService;
    private TodoBusiness todoBusiness;

    @Test
    public void testRetrieve_SpringToDos_size2() {
        todoService = Mockito.mock(TodoService.class);
        todoBusiness = new TodoBusiness(todoService);

        Mockito.when(todoService.retrieveTodos("Test"))
                .thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance"));

        List<String> result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(result.size(), 2);
    }

    @Test
    public void testRetrieve_SpringToDos_empty() {
        todoService = Mockito.mock(TodoService.class);
        todoBusiness = new TodoBusiness(todoService);

        Mockito.when(todoService.retrieveTodos("Test"))
                .thenReturn(new ArrayList<>());

        List<String> result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(result.size(), 0);
    }

    @Test
    public void testChainMockReturns() {
        todoService = Mockito.mock(TodoService.class);
        todoBusiness = new TodoBusiness(todoService);

        Mockito.when(todoService.retrieveTodos("Test"))
                .thenReturn(new ArrayList<>()).thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance"));

        List<String> result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(result.size(), 0);
        result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        assertEquals(result.size(), 2);

    }

    @Test
    public void testMethodCalled() {
        todoService = Mockito.mock(TodoService.class);
        todoBusiness = new TodoBusiness(todoService);

        Mockito.when(todoService.retrieveTodos("Test"))
                .thenReturn(new ArrayList<>()).thenReturn(Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance"));

        List<String> result = todoBusiness.retrieveTodosRelatedToSpring("Test");
        verify(todoService, times(1)).retrieveTodos("Test");
    }
}

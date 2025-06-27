package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // 1. Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Inject into service
        MyService service = new MyService(mockApi);

        // 3. Call method
        service.fetchData();

        // 4. Verify interaction
        verify(mockApi).getData();  // ✅ Asserts this was called
    }
}

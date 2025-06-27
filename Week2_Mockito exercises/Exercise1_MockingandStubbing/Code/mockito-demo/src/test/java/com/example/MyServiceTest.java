package com.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // 1. Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // 2. Stub method to return mock data
        when(mockApi.getData()).thenReturn("Mock Data");

        // 3. Inject mock into service
        MyService service = new MyService(mockApi);

        // 4. Call method and verify result
        String result = service.fetchData();
        assertEquals("Mock Data", result);
    }
}

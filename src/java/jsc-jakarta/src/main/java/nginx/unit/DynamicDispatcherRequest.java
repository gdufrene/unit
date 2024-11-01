package nginx.unit;

import jakarta.servlet.DispatcherType;

public interface DynamicDispatcherRequest
{
    public void setDispatcherType(DispatcherType type);
}

package com.onemount.service.common.shared.shared;

public interface AggregateRoot<T> extends Entity<T> {
    T clone();
}

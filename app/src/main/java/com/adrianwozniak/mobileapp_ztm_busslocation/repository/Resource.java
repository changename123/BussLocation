package com.adrianwozniak.mobileapp_ztm_busslocation.repository;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Resource<T> {

    @NonNull
    public ResourceStatus status;

    @Nullable
    public final T data;

    @Nullable
    public final String message;


    public Resource(@NonNull ResourceStatus status, @Nullable T data, @Nullable String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public static <T> Resource<T> success(@Nullable T data){
        return new Resource<>(ResourceStatus.SUCCESS, data, null);
    }
    public static <T> Resource<T> error(@NonNull String message ,@Nullable T data){
        return new Resource<>(ResourceStatus.ERROR, data, message);
    }

    public static <T> Resource<T> loading(@Nullable T data){
        return new Resource<>(ResourceStatus.LOADING, data, null);

    }

    public enum ResourceStatus{ SUCCESS, LOADING, ERROR}
}


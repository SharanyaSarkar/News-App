package com.happycoding.feednews;

import java.util.List;

public interface OnFetchDataListener<MainNews> {
    void onFetchData(List<MainNews> list, String message);

    void onError(String message);
}
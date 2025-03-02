package com.dataloader;

import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.stream.Collectors;

public class ModelMapperUtil {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static <S, T> List<T> mapList(List<S> sourceList, Class<T> targetClass) {
        return sourceList.stream()
                .map(element -> modelMapper.map(element, targetClass))
                .collect(Collectors.toList());
    }
}
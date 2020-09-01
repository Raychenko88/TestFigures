package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Color {
    BLUE("blue"),
    GREEN("green"),
    YELLOW("yellow"),
    RED("red"),
    BLACK("black");

    private final String value;
}

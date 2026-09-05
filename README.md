# Lab Task 1 — Temperature Converter

## Objective

Test the correctness of temperature conversion formulas between Celsius, Fahrenheit, and Kelvin.

## Implementation

The `TemperatureConverter.java` class contains methods for:

* Celsius to Fahrenheit
* Fahrenheit to Celsius
* Celsius to Kelvin

## Testing

JUnit tests are written in `TemperatureConverterTest.java`.

The tests verify:

* `0°C → 32°F`
* `100°C → 212°F`
* `32°F → 0°C`
* `212°F → 100°C`
* Celsius → Fahrenheit → Celsius round-trip conversion

Approximate equality is checked using:

```java
assertEquals(expected, actual, 0.01);
```

## Expected Result

All test cases should pass successfully.

## Technologies

* Java
* JUnit
* NetBeans

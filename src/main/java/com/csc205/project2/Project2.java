//Author: Tressa Ortiz
//Project 2
//Date: Sept 19, 2021
//CSC 205AA
package com.csc205.project2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 * <p>
 * Modify the driver as needed to demonstrate your classes.
 */
public class Project2 {

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        /*ThreeDimensionalShape sphere = new Sphere(2.0);
        ThreeDimensionalShape cube = new Cube(5.0);
        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);

        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */

        ThreeDimensionalShape sphere = new Sphere(2.0);
        System.out.println(sphere);

        ThreeDimensionalShape cube = new Cube(5.0);
        System.out.println(cube);

        ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        System.out.println(cylinder);

        ThreeDimensionalShape cone = new Cone(4.0, 3.0);
        System.out.println(cone);

        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);


    }

}

//Output:
// Sphere {radius=2.0, surface area=50.26548245743669, volume=33.510321638291124}
//Cube{width=5.0, surface area=150.0, volume=125.0}
//Cylinder{height=4.0, radius=1.0, surface area=31.41592653589793, volume= 12.566370614359172}
//Cone{radius=3.0, height=4.0, surface area=75.39822368615503, volume= 37.69911184307752}
//
//Process finished with exit code 0
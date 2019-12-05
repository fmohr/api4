/**
 * The idea of reconstructible objects is that they can be serialized in the form of a compact build plan, which can be unpacked later
 * into an object with the same properties.
 *
 * The important difference to serialization is that the object is not stored with all its variable values etc., which can be extremely
 * memory intensive but in the form of a *construction plan* that describes what steps need to be undertaken to reproduce the object.
 *
 * Since reconstruction steps can comprise many method invocations on the object, it is not possible to automatically create a compact
 * construction plan inside the object itself. Rather should methods used to alter an object tell the reconstructible object what
 * have done in terms of an instruction.
 *
 * Important examples for reproducible objects can be algorithms or datasets. Instead of storing the whole dataset, one can save only
 * the information where the data is stored and how it should be read.
 *
 * The general concept of reproduction is the exclusive use of static methods of utility classes.
 * Those methods must have at most one non-primitive argument (which takes the role of the object to be created).
 * The first instruction in the plan denominates the static method that creates the object; it is the only instruction without an object argument.
 *
 * Even though this is no formal condition, it is generally good practice and easily achievable that a reconstructed object itself is reconstructible as well.
 *
 * @author Felix Mohr
 *
 */
package org.api4.java.common.reconstruction;
// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

package hep.aida.bin;

/**
 * Interface that represents a function object: a function that takes 
 * two bins as arguments and returns a single value.
 */
public interface BinFunction1D {
/**
 * Applies a function to one bin argument.
 *
 * @param x   the argument passed to the function.
 * @return the result of the function.
 */
abstract public double apply(DynamicBin1D x);
/**
 * Returns the name of this function.
 *
 * @return the name of this function.
 */
abstract public String name();
}

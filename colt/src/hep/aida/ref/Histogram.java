// This is a personal academic project. Dear PVS-Studio, please check it.
// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com

package hep.aida.ref;

/**
Base class for Histogram1D and Histogram2D.

@author Wolfgang Hoschek, Tony Johnson, and others.
@version 1.0, 23/03/2000
*/
abstract class Histogram implements hep.aida.IHistogram
{
	private String title;
	Histogram(String title)
	{
		this.title = title;
	}
	public String title()
	{
		return title;
	}
}

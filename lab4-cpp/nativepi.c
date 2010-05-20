/*
 * nativepi.c
 *
 *  Created on: May 21, 2010
 *      Author: radu
 */

#include "nativepi.h"
#include <omp.h>

JNIEXPORT jdouble JNICALL Java_app_NativePI_PI
  (JNIEnv *env, jclass obj, jint steps, jint threads)
{
	int i;
	double x, sum = 0.0, pi, step;
	step = 1.0/(double) steps;
	omp_set_num_threads(threads);

#pragma omp parallel private(i,x) shared(step, steps, sum)
	{
#pragma omp for reduction(+:sum)
		for (i=0; i<steps; i++) {
			x = (i+0.5)*step;
			sum = sum + 4.0/(1.0 + x*x);
		}
	}

	pi = step * sum;

	return pi;
}

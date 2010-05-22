/*
 * This file was generated by orbit-idl-2 - DO NOT EDIT!
 */

#ifndef Calculator_H
#define Calculator_H 1
#include <glib.h>
#define ORBIT_IDL_SERIAL 20
#include <orbit/orbit-types.h>

#ifdef __cplusplus
extern "C" {
#endif /* __cplusplus */


/** typedefs **/
#if !defined(ORBIT_DECL_calc_Calculator) && !defined(_calc_Calculator_defined)
#define ORBIT_DECL_calc_Calculator 1
#define _calc_Calculator_defined 1
#define calc_Calculator__freekids CORBA_Object__freekids
typedef CORBA_Object calc_Calculator;
extern CORBA_unsigned_long calc_Calculator__classid;
#if !defined(TC_IMPL_TC_calc_Calculator_0)
#define TC_IMPL_TC_calc_Calculator_0 'C'
#define TC_IMPL_TC_calc_Calculator_1 'a'
#define TC_IMPL_TC_calc_Calculator_2 'l'
#define TC_IMPL_TC_calc_Calculator_3 'c'
#define TC_IMPL_TC_calc_Calculator_4 'u'
#define TC_IMPL_TC_calc_Calculator_5 'l'
#define TC_IMPL_TC_calc_Calculator_6 'a'
#define TC_IMPL_TC_calc_Calculator_7 't'
#define TC_IMPL_TC_calc_Calculator_8 'o'
#define TC_IMPL_TC_calc_Calculator_9 'r'
#ifdef ORBIT_IDL_C_IMODULE_Calculator
static
#else
extern
#endif
ORBIT2_MAYBE_CONST struct CORBA_TypeCode_struct TC_calc_Calculator_struct;
#define TC_calc_Calculator ((CORBA_TypeCode)&TC_calc_Calculator_struct)
#endif
#endif

/** POA structures **/
#ifndef _defined_POA_calc_Calculator
#define _defined_POA_calc_Calculator 1
typedef struct {
  void *_private;
CORBA_long_long (*aduna)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long (*scade)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long (*inmulteste)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long (*imparte)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_string (*baza2)(PortableServer_Servant _servant, const CORBA_long_long n, CORBA_Environment *ev);
} POA_calc_Calculator__epv;
typedef struct {
  PortableServer_ServantBase__epv *_base_epv;
  POA_calc_Calculator__epv *calc_Calculator_epv;
} POA_calc_Calculator__vepv;
typedef struct {
  void *_private;
  POA_calc_Calculator__vepv *vepv;
} POA_calc_Calculator;
extern void POA_calc_Calculator__init(PortableServer_Servant servant, CORBA_Environment *ev);
extern void POA_calc_Calculator__fini(PortableServer_Servant servant, CORBA_Environment *ev);
#endif /* _defined_POA_calc_Calculator */

/** skel prototypes **/
void _ORBIT_skel_small_calc_Calculator_aduna(POA_calc_Calculator *_ORBIT_servant, gpointer _ORBIT_retval, gpointer *_ORBIT_args, CORBA_Context ctx,CORBA_Environment *ev, CORBA_long_long (*_impl_aduna)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev));
void _ORBIT_skel_small_calc_Calculator_scade(POA_calc_Calculator *_ORBIT_servant, gpointer _ORBIT_retval, gpointer *_ORBIT_args, CORBA_Context ctx,CORBA_Environment *ev, CORBA_long_long (*_impl_scade)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev));
void _ORBIT_skel_small_calc_Calculator_inmulteste(POA_calc_Calculator *_ORBIT_servant, gpointer _ORBIT_retval, gpointer *_ORBIT_args, CORBA_Context ctx,CORBA_Environment *ev, CORBA_long_long (*_impl_inmulteste)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev));
void _ORBIT_skel_small_calc_Calculator_imparte(POA_calc_Calculator *_ORBIT_servant, gpointer _ORBIT_retval, gpointer *_ORBIT_args, CORBA_Context ctx,CORBA_Environment *ev, CORBA_long_long (*_impl_imparte)(PortableServer_Servant _servant, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev));
void _ORBIT_skel_small_calc_Calculator_baza2(POA_calc_Calculator *_ORBIT_servant, gpointer _ORBIT_retval, gpointer *_ORBIT_args, CORBA_Context ctx,CORBA_Environment *ev, CORBA_string (*_impl_baza2)(PortableServer_Servant _servant, const CORBA_long_long n, CORBA_Environment *ev));

/** stub prototypes **/
CORBA_long_long calc_Calculator_aduna(calc_Calculator _obj, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long calc_Calculator_scade(calc_Calculator _obj, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long calc_Calculator_inmulteste(calc_Calculator _obj, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_long_long calc_Calculator_imparte(calc_Calculator _obj, const CORBA_long_long a, const CORBA_long_long b, CORBA_Environment *ev);
CORBA_string calc_Calculator_baza2(calc_Calculator _obj, const CORBA_long_long n, CORBA_Environment *ev);
#include <orbit/orb-core/orbit-interface.h>

#ifdef ORBIT_IDL_C_IMODULE_Calculator
static 
#else
extern 
#endif
ORBit_IInterface calc_Calculator__iinterface;
#define calc_Calculator_IMETHODS_LEN 5
#ifdef ORBIT_IDL_C_IMODULE_Calculator
static 
#else
extern 
#endif
ORBit_IMethod calc_Calculator__imethods[calc_Calculator_IMETHODS_LEN];

/** IMethods index */

#ifndef __calc_Calculator__imethods_index
#define __calc_Calculator__imethods_index
typedef enum {
	calc_Calculator_aduna__imethods_index,
	calc_Calculator_scade__imethods_index,
	calc_Calculator_inmulteste__imethods_index,
	calc_Calculator_imparte__imethods_index,
	calc_Calculator_baza2__imethods_index
} calc_Calculator__imethods_index;
#endif /* __calc_Calculator__imethods_index */

#ifndef __ORBIT_IMETHODS_INDEX
#define __ORBIT_IMETHODS_INDEX
#define ORBIT_IMETHODS_INDEX(m) (m ## __imethods_index)
#endif /* __ORBIT_IMETHODS_INDEX */

#ifdef __cplusplus
}
#endif /* __cplusplus */

#ifndef EXCLUDE_ORBIT_H
#include <orbit/orbit.h>

#endif /* EXCLUDE_ORBIT_H */
#endif
#undef ORBIT_IDL_SERIAL

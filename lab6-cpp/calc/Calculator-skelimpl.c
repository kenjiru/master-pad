/* This is a template file generated by command */
/* orbit-idl-2 --skeleton-impl Calculator.idl */
/* User must edit this file, inserting servant  */
/* specific code between markers. */

#include "Calculator.h"

/*** App-specific servant structures ***/

#if !defined(_typedef_impl_POA_calc_Calculator_)
#define _typedef_impl_POA_calc_Calculator_ 1
typedef struct {
POA_calc_Calculator servant;
PortableServer_POA poa;
   /* ------ add private attributes here ------ */
   /* ------ ---------- end ------------ ------ */
} impl_POA_calc_Calculator;
#endif


/*** Implementation stub prototypes ***/

#if !defined(_decl_impl_calc_Calculator__destroy_)
#define _decl_impl_calc_Calculator__destroy_ 1
static void impl_calc_Calculator__destroy(impl_POA_calc_Calculator *servant,
CORBA_Environment *ev);
#endif

#if !defined(_decl_impl_calc_Calculator_aduna_)
#define _decl_impl_calc_Calculator_aduna_ 1
static CORBA_long_long
impl_calc_Calculator_aduna(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev);
#endif

#if !defined(_decl_impl_calc_Calculator_scade_)
#define _decl_impl_calc_Calculator_scade_ 1
static CORBA_long_long
impl_calc_Calculator_scade(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev);
#endif

#if !defined(_decl_impl_calc_Calculator_inmulteste_)
#define _decl_impl_calc_Calculator_inmulteste_ 1
static CORBA_long_long
impl_calc_Calculator_inmulteste(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev);
#endif

#if !defined(_decl_impl_calc_Calculator_imparte_)
#define _decl_impl_calc_Calculator_imparte_ 1
static CORBA_long_long
impl_calc_Calculator_imparte(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev);
#endif

#if !defined(_decl_impl_calc_Calculator_baza2_)
#define _decl_impl_calc_Calculator_baza2_ 1
static CORBA_string
impl_calc_Calculator_baza2(impl_POA_calc_Calculator *servant,
const CORBA_long_long n,
CORBA_Environment *ev);
#endif


/*** epv structures ***/

#if !defined(_impl_calc_Calculator_base_epv_)
#define _impl_calc_Calculator_base_epv_ 1
static PortableServer_ServantBase__epv impl_calc_Calculator_base_epv = {
NULL,             /* _private data */
(gpointer) & impl_calc_Calculator__destroy, /* finalize routine */
NULL,             /* default_POA routine */
};
#endif

#if !defined(_impl_calc_Calculator_epv_)
#define _impl_calc_Calculator_epv_ 1
static POA_calc_Calculator__epv impl_calc_Calculator_epv = {
NULL, /* _private */
(gpointer)&impl_calc_Calculator_aduna,
(gpointer)&impl_calc_Calculator_scade,
(gpointer)&impl_calc_Calculator_inmulteste,
(gpointer)&impl_calc_Calculator_imparte,
(gpointer)&impl_calc_Calculator_baza2,
};
#endif


/*** vepv structures ***/

#if !defined(_impl_calc_Calculator_vepv_)
#define _impl_calc_Calculator_vepv_ 1
static POA_calc_Calculator__vepv impl_calc_Calculator_vepv = {
&impl_calc_Calculator_base_epv,
&impl_calc_Calculator_epv,
};
#endif


/*** Stub implementations ***/

#if !defined(_impl_calc_Calculator__create_)
#define _impl_calc_Calculator__create_ 1
static calc_Calculator impl_calc_Calculator__create(PortableServer_POA poa, CORBA_Environment *ev)
{
calc_Calculator retval;
impl_POA_calc_Calculator *newservant;
PortableServer_ObjectId *objid;

newservant = g_new0(impl_POA_calc_Calculator, 1);
newservant->servant.vepv = &impl_calc_Calculator_vepv;
newservant->poa = (PortableServer_POA) CORBA_Object_duplicate((CORBA_Object)poa, ev);
POA_calc_Calculator__init((PortableServer_Servant)newservant, ev);
   /* Before servant is going to be activated all
    * private attributes must be initialized.  */

   /* ------ init private attributes here ------ */
   /* ------ ---------- end ------------- ------ */

objid = PortableServer_POA_activate_object(poa, newservant, ev);
CORBA_free(objid);
retval = PortableServer_POA_servant_to_reference(poa, newservant, ev);

return retval;
}
#endif

#if !defined(_impl_calc_Calculator__destroy_)
#define _impl_calc_Calculator__destroy_ 1
static void
impl_calc_Calculator__destroy(impl_POA_calc_Calculator *servant, CORBA_Environment *ev)
{
    CORBA_Object_release ((CORBA_Object) servant->poa, ev);

    /* No further remote method calls are delegated to 
    * servant and you may free your private attributes. */
   /* ------ free private attributes here ------ */
   /* ------ ---------- end ------------- ------ */

POA_calc_Calculator__fini((PortableServer_Servant)servant, ev);

g_free (servant);
}
#endif

#if !defined(_impl_calc_Calculator_aduna_)
#define _impl_calc_Calculator_aduna_ 1
static CORBA_long_long
impl_calc_Calculator_aduna(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev)
{
 /* ------   insert method code here   ------ */
	return a + b;
 /* ------ ---------- end ------------ ------ */
}
#endif

#if !defined(_impl_calc_Calculator_scade_)
#define _impl_calc_Calculator_scade_ 1
static CORBA_long_long
impl_calc_Calculator_scade(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev)
{
 /* ------   insert method code here   ------ */
	return a - b;
 /* ------ ---------- end ------------ ------ */
}
#endif

#if !defined(_impl_calc_Calculator_inmulteste_)
#define _impl_calc_Calculator_inmulteste_ 1
static CORBA_long_long
impl_calc_Calculator_inmulteste(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev)
{
 /* ------   insert method code here   ------ */
	return a * b;
 /* ------ ---------- end ------------ ------ */
}
#endif

#if !defined(_impl_calc_Calculator_imparte_)
#define _impl_calc_Calculator_imparte_ 1
static CORBA_long_long
impl_calc_Calculator_imparte(impl_POA_calc_Calculator *servant,
const CORBA_long_long a,
const CORBA_long_long b,
CORBA_Environment *ev)
{
 /* ------   insert method code here   ------ */
	return a / b;
 /* ------ ---------- end ------------ ------ */
}
#endif

#if !defined(_impl_calc_Calculator_baza2_)
#define _impl_calc_Calculator_baza2_ 1
static CORBA_string
impl_calc_Calculator_baza2(impl_POA_calc_Calculator *servant,
const CORBA_long_long n,
CORBA_Environment *ev)
{
 /* ------   insert method code here   ------ */
	CORBA_string str = CORBA_string_alloc(100);
	char t;
	int i = 0, j, r;
	long a = n;

	while (a > 0) {
		r = a % 2;
		str[i++] = '0' + r;
		a = a / 2;
	}
	str[i] = 0;

	// inversez sirul
	j = 0;
	while (j < i / 2) {
		t = str[j];
		str[j] = str[i-j-1];
		str[i-j-1] = t;
		j++;
	}
	return str;
 /* ------ ---------- end ------------ ------ */

}
#endif

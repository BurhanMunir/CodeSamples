package crc64d478ed32b2f14986;


public class FitRunnable
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_run:()V:GetRunHandler:Java.Lang.IRunnableInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Syncfusion.XForms.Android.RichTextEditor.FitRunnable, Syncfusion.SfRichTextEditor.XForms.Android", FitRunnable.class, __md_methods);
	}


	public FitRunnable ()
	{
		super ();
		if (getClass () == FitRunnable.class) {
			mono.android.TypeManager.Activate ("Syncfusion.XForms.Android.RichTextEditor.FitRunnable, Syncfusion.SfRichTextEditor.XForms.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public FitRunnable (crc64d478ed32b2f14986.SfRichTextEditorRendererExt p0)
	{
		super ();
		if (getClass () == FitRunnable.class) {
			mono.android.TypeManager.Activate ("Syncfusion.XForms.Android.RichTextEditor.FitRunnable, Syncfusion.SfRichTextEditor.XForms.Android", "Syncfusion.XForms.Android.RichTextEditor.SfRichTextEditorRendererExt, Syncfusion.SfRichTextEditor.XForms.Android", this, new java.lang.Object[] { p0 });
		}
	}


	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}

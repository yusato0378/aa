// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.*;
import android.view.*;
import java.util.*;

class FragmentTransitionCompat21
{
    public static class EpicenterView
    {

        public View epicenter;

        public EpicenterView()
        {
        }
    }

    public static interface ViewRetriever
    {

        public abstract View getView();
    }


    FragmentTransitionCompat21()
    {
    }

    public static void addTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
            ((Transition) (obj)).addTarget((View)arraylist.get(i));

    }

    public static void addTransitionTargets(Object obj, Object obj1, View view, ViewRetriever viewretriever, View view1, EpicenterView epicenterview, Map map, ArrayList arraylist, 
            Map map1, ArrayList arraylist1)
    {
        if(obj != null || obj1 != null)
        {
            obj = (Transition)obj;
            if(obj != null)
                ((Transition) (obj)).addTarget(view1);
            if(obj1 != null)
                addTargets((Transition)obj1, arraylist1);
            if(viewretriever != null)
                view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, viewretriever, map, map1, ((Transition) (obj)), arraylist) {

                    public boolean onPreDraw()
                    {
                        container.getViewTreeObserver().removeOnPreDrawListener(this);
                        View view2 = inFragment.getView();
                        if(view2 != null)
                        {
                            if(!nameOverrides.isEmpty())
                            {
                                FragmentTransitionCompat21.findNamedViews(renamedViews, view2);
                                renamedViews.keySet().retainAll(nameOverrides.values());
                                Iterator iterator = nameOverrides.entrySet().iterator();
                                do
                                {
                                    if(!iterator.hasNext())
                                        break;
                                    java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                                    Object obj2 = (String)entry.getValue();
                                    obj2 = (View)renamedViews.get(obj2);
                                    if(obj2 != null)
                                        ((View) (obj2)).setTransitionName((String)entry.getKey());
                                } while(true);
                            }
                            if(enterTransition != null)
                            {
                                FragmentTransitionCompat21.captureTransitioningViews(enteringViews, view2);
                                enteringViews.removeAll(renamedViews.values());
                                FragmentTransitionCompat21.addTargets(enterTransition, enteringViews);
                            }
                        }
                        return true;
                    }

                    final View val$container;
                    final Transition val$enterTransition;
                    final ArrayList val$enteringViews;
                    final ViewRetriever val$inFragment;
                    final Map val$nameOverrides;
                    final Map val$renamedViews;

            
            {
                container = view;
                inFragment = viewretriever;
                nameOverrides = map;
                renamedViews = map1;
                enterTransition = transition;
                enteringViews = arraylist;
                super();
            }
                }
);
            setSharedElementEpicenter(((Transition) (obj)), epicenterview);
        }
    }

    public static void beginDelayedTransition(ViewGroup viewgroup, Object obj)
    {
        TransitionManager.beginDelayedTransition(viewgroup, (Transition)obj);
    }

    public static Object captureExitingViews(Object obj, View view, ArrayList arraylist, Map map)
    {
label0:
        {
            Object obj1 = obj;
            if(obj != null)
            {
                captureTransitioningViews(arraylist, view);
                if(map != null)
                    arraylist.removeAll(map.values());
                if(!arraylist.isEmpty())
                    break label0;
                obj1 = null;
            }
            return obj1;
        }
        addTargets((Transition)obj, arraylist);
        return obj;
    }

    private static void captureTransitioningViews(ArrayList arraylist, View view)
    {
label0:
        {
            if(view.getVisibility() == 0)
            {
                if(!(view instanceof ViewGroup))
                    break label0;
                view = (ViewGroup)view;
                if(view.isTransitionGroup())
                {
                    arraylist.add(view);
                } else
                {
                    int j = view.getChildCount();
                    int i = 0;
                    while(i < j) 
                    {
                        captureTransitioningViews(arraylist, view.getChildAt(i));
                        i++;
                    }
                }
            }
            return;
        }
        arraylist.add(view);
    }

    public static void cleanupTransitions(View view, View view1, Object obj, ArrayList arraylist, Object obj1, ArrayList arraylist1, Object obj2, ArrayList arraylist2, 
            Object obj3, ArrayList arraylist3, Map map)
    {
        obj = (Transition)obj;
        obj1 = (Transition)obj1;
        obj2 = (Transition)obj2;
        obj3 = (Transition)obj3;
        if(obj3 != null)
            view.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener(view, ((Transition) (obj)), view1, arraylist, ((Transition) (obj1)), arraylist1, ((Transition) (obj2)), arraylist2, map, arraylist3, ((Transition) (obj3))) {

                public boolean onPreDraw()
                {
                    sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
                    if(enterTransition != null)
                    {
                        enterTransition.removeTarget(nonExistentView);
                        FragmentTransitionCompat21.removeTargets(enterTransition, enteringViews);
                    }
                    if(exitTransition != null)
                        FragmentTransitionCompat21.removeTargets(exitTransition, exitingViews);
                    if(sharedElementTransition != null)
                        FragmentTransitionCompat21.removeTargets(sharedElementTransition, sharedElementTargets);
                    java.util.Map.Entry entry;
                    for(Iterator iterator = renamedViews.entrySet().iterator(); iterator.hasNext(); ((View)entry.getValue()).setTransitionName((String)entry.getKey()))
                        entry = (java.util.Map.Entry)iterator.next();

                    int j = hiddenViews.size();
                    for(int i = 0; i < j; i++)
                        overallTransition.excludeTarget((View)hiddenViews.get(i), false);

                    overallTransition.excludeTarget(nonExistentView, false);
                    return true;
                }

                final Transition val$enterTransition;
                final ArrayList val$enteringViews;
                final Transition val$exitTransition;
                final ArrayList val$exitingViews;
                final ArrayList val$hiddenViews;
                final View val$nonExistentView;
                final Transition val$overallTransition;
                final Map val$renamedViews;
                final View val$sceneRoot;
                final ArrayList val$sharedElementTargets;
                final Transition val$sharedElementTransition;

            
            {
                sceneRoot = view;
                enterTransition = transition;
                nonExistentView = view1;
                enteringViews = arraylist;
                exitTransition = transition1;
                exitingViews = arraylist1;
                sharedElementTransition = transition2;
                sharedElementTargets = arraylist2;
                renamedViews = map;
                hiddenViews = arraylist3;
                overallTransition = transition3;
                super();
            }
            }
);
    }

    public static Object cloneTransition(Object obj)
    {
        Object obj1 = obj;
        if(obj != null)
            obj1 = ((Transition)obj).clone();
        return obj1;
    }

    public static void excludeTarget(Object obj, View view, boolean flag)
    {
        ((Transition)obj).excludeTarget(view, flag);
    }

    public static void findNamedViews(Map map, View view)
    {
        if(view.getVisibility() == 0)
        {
            String s = view.getTransitionName();
            if(s != null)
                map.put(s, view);
            if(view instanceof ViewGroup)
            {
                view = (ViewGroup)view;
                int j = view.getChildCount();
                for(int i = 0; i < j; i++)
                    findNamedViews(map, view.getChildAt(i));

            }
        }
    }

    private static Rect getBoundsOnScreen(View view)
    {
        Rect rect = new Rect();
        int ai[] = new int[2];
        view.getLocationOnScreen(ai);
        rect.set(ai[0], ai[1], ai[0] + view.getWidth(), ai[1] + view.getHeight());
        return rect;
    }

    public static String getTransitionName(View view)
    {
        return view.getTransitionName();
    }

    public static Object mergeTransitions(Object obj, Object obj1, Object obj2, boolean flag)
    {
        boolean flag2 = true;
        Transition transition = (Transition)obj;
        obj = (Transition)obj1;
        obj2 = (Transition)obj2;
        boolean flag1 = flag2;
        if(transition != null)
        {
            flag1 = flag2;
            if(obj != null)
                flag1 = flag;
        }
        if(flag1)
        {
            obj1 = new TransitionSet();
            if(transition != null)
                ((TransitionSet) (obj1)).addTransition(transition);
            if(obj != null)
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            if(obj2 != null)
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            return obj1;
        }
        obj1 = null;
        if(obj != null && transition != null)
            obj = (new TransitionSet()).addTransition(((Transition) (obj))).addTransition(transition).setOrdering(1);
        else
        if(obj == null)
        {
            obj = obj1;
            if(transition != null)
                obj = transition;
        }
        if(obj2 != null)
        {
            obj1 = new TransitionSet();
            if(obj != null)
                ((TransitionSet) (obj1)).addTransition(((Transition) (obj)));
            ((TransitionSet) (obj1)).addTransition(((Transition) (obj2)));
            return obj1;
        } else
        {
            return obj;
        }
    }

    public static void removeTargets(Object obj, ArrayList arraylist)
    {
        obj = (Transition)obj;
        int j = arraylist.size();
        for(int i = 0; i < j; i++)
            ((Transition) (obj)).removeTarget((View)arraylist.get(i));

    }

    public static void setEpicenter(Object obj, View view)
    {
        ((Transition)obj).setEpicenterCallback(new android.transition.Transition.EpicenterCallback(getBoundsOnScreen(view)) {

            public Rect onGetEpicenter(Transition transition)
            {
                return epicenter;
            }

            final Rect val$epicenter;

            
            {
                epicenter = rect;
                super();
            }
        }
);
    }

    private static void setSharedElementEpicenter(Transition transition, EpicenterView epicenterview)
    {
        if(transition != null)
            transition.setEpicenterCallback(new android.transition.Transition.EpicenterCallback(epicenterview) {

                public Rect onGetEpicenter(Transition transition1)
                {
                    if(mEpicenter == null && epicenterView.epicenter != null)
                        mEpicenter = FragmentTransitionCompat21.getBoundsOnScreen(epicenterView.epicenter);
                    return mEpicenter;
                }

                private Rect mEpicenter;
                final EpicenterView val$epicenterView;

            
            {
                epicenterView = epicenterview;
                super();
            }
            }
);
    }


}

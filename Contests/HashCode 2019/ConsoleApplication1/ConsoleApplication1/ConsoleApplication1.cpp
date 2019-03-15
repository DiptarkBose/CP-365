#include <iostream>
#include <iomanip>
#include <vector>
#include <algorithm>
#include <queue>
#include <stack>
#include <string>
#include <unordered_map>
#include <math.h>
#include <map>
#include <set>

#include <cstring>
/** In set, multiset ,map etc the concept of index
	does not exist. */

	/* :)

	When I saw you I would lose control
	Made me feel like there was no tomorrow
	Should've told you that you're beautiful
	But the days pass and now it's so long ago

	Did you make it?
	Did you break free?
	Did you manage to be who you wanna be?
	Maybe somewhere you think about me too

	I wonder where are you now
	~

	*/


using namespace std;


/** find_by_order(int k) -> iterator to kth largest element
	order_of_key(int e)  -> position of element with
	value 'e' ie. number of elements strictly less than e */

int mod = 1000000007;

int powmod(int64_t a, int64_t b) {
	int64_t ans = 1; while (b > 0) {
		if (b & 1) { b--; ans = (ans*a) % mod; }
		else { a = (a*a) % mod; b = b >> 1; }
	}return ans;
}

int main() {
	///learn from your mistakes
	///read the question properly
	///initialize variables s'il vous plait
	int n;
	cin >> n;
	map <string, int> tags; // each tag has int
	int starting = 0;
	//vector <int> tag_count(n * 100, 0);

	vector < pair <vector <int>, pair <int, int> > > photos;
	vector < pair<vector <int>, pair <int, int> > > v_photos;

	for (int i = 0; i < n; i++) {
		char type;
		int m;
		cin >> type >> m;
		vector <int> t(m);
		for (int j = 0; j < m; j++) {
			string s;
			cin >> s;

			if (tags.find(s) != tags.end()) {
				tags[s] = starting;
				t[j] = starting;
				starting++;
			}
			else {
				t[j] = tags[s];
			}

		}
		if (type == 'H') {
			photos.push_back(make_pair(t, make_pair(i, -1)));
		}
		else
			v_photos.push_back(make_pair(t, make_pair(i, -1)));
	}


	//nitish code here
	/*int i , j;
	int N = v_photos.size();
	 vector<vector<int>>v;
  vector<int>p,p1;
  for(int i = 0 ; i < v_photos.size(); i++){
	v[i] = v_photos[i].first;
  }
  vector<vector<int>>v1;
  vector<vector<int>>v2;
  vector<pair<int,int>>v3;
   vector<pair<int,int>>::iterator it;
	  vector<vector<int>>v4;
	   vector<vector<int>>::iterator it1;
  int arr[1000000];
	int k=0,count=0;
  for(i=0;i<N;i++)
  { p.clear();
	  p1.clear();
	for(j=0;j<N;j++)
	{
	if(i!=j){
	count=0;
  //  cout<<j<<endl;
	memset(arr,0,sizeof(arr));
   for(k=0;k<v[i].size();k++)
   {
	 arr[v[i][k]]++;
   }
  for(k=0;k<v[j].size();k++)
  {
	if(arr[v[j][k]]>0)
	{
	  count++;
	}
  }
  //cout<<count<<endl;
  p.push_back(count);
  p1.push_back(j);
  }
  }
   v1.push_back(p);
  v2.push_back(p1);
  }


  int ma = -1;
  int ind;
  int visited1[n];
memset(visited1,false,sizeof(visited1));
  for(i=0;i<n;i++)
  {
	if(!visited1[i]){
		ma = -1;
	for(j=0;j<v1[i].size();j++)
	{
	   if(!visited1[v2[i][j]])
	   {
	   //    cout<<v2[i][j]<<endl;
		  if(v1[i][j]>ma)
		  {
			ma = v1[i][j];
			ind = v2[i][j];
		  }
	   }
	}
   // cout<<ind <<":"<< i<<endl;
	 visited1[ind]=true;
	 visited1[i] = true;
	 v3.push_back(make_pair(i,ind));
	}
  }
  k=0;
  set<int>s;
   set<int>::iterator it2;
  for(it=v3.begin();it!=v3.end();it++)
  {
	  p.clear();
	int a = it->first;
	for(i=0;i<v[a].size();i++)
	 {
		s.insert(v[a][i]);
	 }
	 //v4.push_back(p);
	 a = it->second;
	 for(i=0;i<v[a].size();i++)
	 {  cout<<v[a][i]<<endl;
		s.insert(v[a][i]);
	 }
	 for(it2=s.begin();it2!=s.end();it2++)
	 {
		 p.push_back(*it2);
	 }
	 s.clear();
	 v4.push_back(p);
	 p.clear();
  }

  for(int i = 0 ; i < v4.size(); i++){
	photos.push_back(make_pair(v4[i], v3[i]));
  }*/
	vector <int> vis(v_photos.size(), 0);

	for (int i = 0; i < v_photos.size(); i++) {

		if (vis[i] == 1) continue;

		vis[i] = 1;
		vector <int> ct(10000000, 0);

		vector <int> ctags = v_photos[i].first;

		for (int k = 0; k < v_photos[i].first.size(); k++) {
			ct[v_photos[i].first[k]] = 1;
		}

		int mc = 0, index = -1;

		for (int j = 0; j < v_photos.size(); j++) {
			if (vis[j] == 1) continue;

			int c = 0;

			for (int k = 0; k < v_photos[j].first.size(); k++) {
				if (ct[v_photos[j].first[k]] == 1) {
					c++;
				}
			}

			if (c > mc) {
				mc = c;
				index = j;
			}
		}
		vis[index] = 1;

		for (int k = 0; k < v_photos[index].first.size(); k++) {
			if (ct[v_photos[index].first[k]] == 0) {
				ctags.push_back(v_photos[index].first[k]);
			}
		}
		photos.push_back(make_pair(ctags, make_pair(v_photos[i].second.first, v_photos[index].second.first)));

	}
	//pre comp diptark
	FILE *fp1;
	fp1 = fopen("precomp", "w");
	for (int i = 0; i < (int)photos.size(); i++) {

		vector <int> ct(10000000, 0);

		for (int k = 0; k < photos[i].first.size(); k++) {
			ct[photos[i].first[k]] = 1;
		}

		for (int j = 0; j < (int)photos.size(); j++) {

			int c = 0;

			for (int k = 0; k < photos[j].first.size(); k++) {
				if (ct[photos[j].first[k]] == 1) {
					c++;
				}
			}

			string a = to_string(c);
			for (int k = 0; k < a.length(); k++) {
				fputc(a[k], fp1);
			}
			fputc('\n', fp1);
		}
	}

	fclose(fp1);

	FILE *fp;
	fp = fopen("precomp", "r");

	// start with node 0

	vector <int> visited(photos.size(), 0);
	cout << photos.size() << "\n";

	cout << photos[0].second.first;
	if (photos[0].second.second != -1) {
		cout << " " << photos[0].second.second;
	}
	cout << "\n";

	int index = 0;

	while (1) {

		visited[index] = 1;

		fseek(fp, index * photos.size(), SEEK_SET);

		vector < pair < int, int > > p;

		for (int j = 0; j < photos.size(); j++) {
			if (visited[j] == 1) {
				while (fgetc(fp) != '\n') {
				}
				continue;
			}

			string x = "";
			char c = fgetc(fp);
			while (c != '\n') {
				x = x + c;
				c = fgetc(fp);
			}
			p.push_back(make_pair(stoi(x), j));

		}

		if ((int)p.size() == 0) {
			break;
		}

		sort(p.begin(), p.end());
		int median = p.size() / 2;

		cout << photos[p[median].second].second.first;
		if (photos[p[median].second].second.second != -1) {
			cout << " " << photos[p[median].second].second.second;
		}
		cout << "\n";

		index = p[median].second;
	}

	fclose(fp);
	return 0;
}
